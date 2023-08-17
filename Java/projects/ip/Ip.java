package projects.ip;

import java.util.Arrays;

public class Ip {
    
    public String valorUsr;
    
    private String valor;
    private String[] octetos = new String[4];
    
    private String valorBin;
    private String[] octetosBin = new String[4];
    
    private String msgErro;
    public String[] colors = {"\033[31;1m", "\033[31;1;7m", "\033[32;1m", "\033[m", "\033[35;1m"};
    
    /**
     * Classe Ip para {@code tratamentos} de dados, verificações e conversões de um IPv4
     */
    public Ip(String ip){
        this.valorUsr = ip;
        if(validarIP(ip)){
            setValor(ip);
            setOctetos();
            setValorBin();
            setOctetosBin();
        }else{
            this.valor = "Endereço IP inválido";
            this.valorBin = "IP inválido para conversão de binário";
            this.octetos = "-1.-1.-1.-1".split("\\.");
            this.octetosBin = "-1.-1.-1.-1".split("\\.");
        }
    }
    
    /**
     * Método responsável por verificar se o valor do ip é {@code valido} para o tratamento.
     * Ele recebe o IP informado pelo usuário e faz um split dele para um vetor de String.
     * O IP deve conter 4 octetos separados por 3 pontos e cada octeto deve conter um número inteiro entre 0 a 255
     * A função retorna true se o {@link #IP()} for válido para o tratamento, caso contrário ela irá retornar false.
     */
    public boolean validarIP(String ip){
                
        //Faz split do IP formatado usando o ponto. Gera algo como: "192.168.0.2".split("\\.") -> {"192", "168" "0", "2"}
        String[] ipSplit = ip.replace(" ", "").split("\\.");
        
        //Verifica se o IP possui 3 octetos conforme a quantidade de índices gerados pelo split
        if(ipSplit.length != 4){ 
            this.msgErro = String.format("IPv4 deve conter %s4 octetos%s preenchidos por um %snúmero inteiro%s :/", colors[1], colors[3],
            colors[0], colors[3]);
            return false;
        }
        
        //Verifica se o vetor de octetos está vazio
        if(ipSplit.length == 0){
            this.msgErro = String.format("O %sIP%s está %svazio%s :/", colors[0], colors[3], colors[1], colors[3]);
                return false;
        }
        
        //For para iterar em cada octeto
        for(int i=0; i <ipSplit.length; i++){
            
            //Cria um vetor de caracteres de cada octeto. Gera algo como: "192".toCharArray() -> {'1', '9', '2'}
            char[] digit = ipSplit[i].toCharArray();
            
            //Verifica se o vetor de caracteres está vazio
            if(digit.length == 0){
                this.msgErro = String.format("O %s%dº octeto%s está %svazio%s :/", colors[0], (i+1), colors[3], colors[1], colors[3]);
                return false;
            }
            
            //For para iterar em cada caractere de cada octeto
            for(int j=0; j<digit.length; j++){
                
                //Verificar se o caractere é diferente de um digito, ou seja, se é uma letra ou caractere especial
                if(!Character.isDigit(digit[j])){
                    this.msgErro = String.format("O %s%dº digito%s do %s%dº octeto%s não é um %snúmero%s :/",
                                                            colors[0], (j+1), colors[3],
                                                            colors[0], (i+1), colors[3],
                                                            colors[1], colors[3]);
                    return false;
                }
            }
            
            //Verifica se o octeto está entre a faixa de valores do IPv4
            if(Integer.parseInt(ipSplit[i]) > 255 || Integer.parseInt(ipSplit[i]) < 0){
                this.msgErro = String.format("O %s%dº octeto%s possui um valor (%s%d%s) que está %sfora da faixa%s :/",                                
                                                            colors[0], (i+1), colors[3],
                                                            colors[0], Integer.parseInt(ipSplit[i]),  colors[3],
                                                            colors[1], 
                                                            colors[3]);
                return false;
            }
        }
        
        //Após passar por todas as verificações, pressupõem que o IP é válido!
        this.msgErro = String.format("IP %svalidado%s :)", colors[2], colors[3]);
        return true;
    }
    
    
    /** 
     * @param ip
     * @return String
     */
    //Método responsável por retornar o IP formatado.
    private String formatIP(String ip){
        String aux, result = "";
        int i = 0;
        for(String octeto: ip.replace(" ", "").split("\\.")){
            //Elimina zeros indevidos
            aux = Integer.toString(Integer.parseInt(octeto));
            result += (i != 3) ? (aux + ".") : aux;
            i++;
        }
        return result;
    }
    
    //Método responsável por retornar os octetos do IP.
    private String[] formatOcteto(String ip){
        return formatIP(ip).split("\\.");
    }
    
    //Método responsável por retornar o IP em Binário.
    private String formatBin(String ip){
        
        //Variáveis de auxílio
        String[] ipSplit = formatOcteto(ip);
        String result = "";
        String aux;
        
        //For para converter cada octeto do IP em binário
        for(int i=0; i<ipSplit.length; i++){
            aux = String.format("%8s", Integer.toBinaryString(Integer.parseInt(ipSplit[i])))
                        .replace(" ", "0");
            result += (i != 3) ? (aux + ".") : aux;
        }
        return result;
    }
    
    //Método responsável por retornar os octetos em Binário.
    private String[] formatOctetoBin(String ip){
        return formatBin(ip).split("\\.");
    }
    
    //Define o valor do IP formatado.
    private void setValor(String ip){
        this.valor = formatIP(ip);
    }
    
    //Define o vetor de octetos (para tratamento individual).
    private void setOctetos(){
        this.octetos = formatOcteto(getValor());
    }
    
    //Define o valor do IP em binário.
    private void setValorBin(){
        this.valorBin = formatBin(getValor());
    }
    
    //Define o vetor de octetos em binário (para tratamento individual).
    private void setOctetosBin(){
        this.octetosBin = formatOctetoBin(getValor());
    }
    
    /**
     * Método responsável por verificar se dois estão na mesma rede. 
     * Deve associar a instância do objeto {@link #IP()} com o método e passar dois parâmetros:
     * 1º sendo a máscara (em notação convencional ou por CIDR) e o 2º um IP para ser comparado. 
     */
    public boolean compararRede(String mask, String ipComp){
        try{
            boolean isCidr = mask.substring(0, 1).equals("/");
            int intCidr;
            intCidr = (isCidr) ? Integer.parseInt(mask.substring(1, mask.length())) :  -1;
            if((validarIP(mask) || (intCidr <= 31 && intCidr >= 1)) && validarIP(ipComp)){
                
                char bitIp, bitIpComp;
                String result1 = "", result2 = "", binCidrFormat = "";
                
                if(!isCidr){
                    char bitMask;
                    for(int i=0; i<32; i++){
                        bitIp = getValorBin().replace(".", "").toCharArray()[i];
                        bitMask = formatBin(mask).replace(".", "").toCharArray()[i];
                        bitIpComp = formatBin(ipComp).replace(".", "").toCharArray()[i];
                        result1 += (bitMask == '1' && bitIp == '1') ? "1" : "0";
                        result2 += (bitMask == '1' && bitIpComp == '1') ? "1" : "0";
                        result1 += ((i+1) % 8 == 0 && (i+1 != 32)) ? "." : "";
                        result2 += ((i+1) % 8 == 0 && (i+1 != 32)) ? "." : "";
                    }
                }else{
                    char[] binCidr = (String.format("%s", "1".repeat(intCidr)) + "0".repeat(32-intCidr))
                                    .toCharArray();
                    for(int i=0; i<32; i++){
                        bitIp = getValorBin().replace(".", "").toCharArray()[i];
                        bitIpComp = formatBin(ipComp).replace(".", "").toCharArray()[i];
                        result1 += (binCidr[i] == '1' && bitIp == '1') ? "1" : "0";
                        result2 += (binCidr[i] == '1' && bitIpComp == '1') ? "1" : "0";
                        result1 += ((i+1) % 8 == 0 && (i+1 != 32)) ? "." : "";
                        result2 += ((i+1) % 8 == 0 && (i+1 != 32)) ? "." : "";
                    }
                    for(int i=0; i<32; i++){
                        binCidrFormat += ((i+1) % 8 == 0 && (i+1 != 32)) ? (binCidr[i] + ".") : binCidr[i];
                    }
                }
                System.out.format("Mask:          %s\n", (!isCidr) ? formatBin(mask) : binCidrFormat);
                System.out.format("IpDefault:     %s\n", getValorBin());
                System.out.format("Resultado A:   %s%s%s\n", colors[4], result1, colors[3]);
                System.out.println();
                System.out.format("Mask:          %s\n", (!isCidr) ? formatBin(mask) : binCidrFormat);
                System.out.format("IpComp:        %s\n", formatBin(ipComp));
                System.out.format("Resultado B:   %s%s%s\n", colors[4], result2, colors[3]);
                return result1.equals(result2);
            }
            System.out.println("Parâmetros inválidos");
            return false;
        }catch(NumberFormatException e){
            System.out.println("Erro de formatação");
            return false;
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Mask ou IP inválido :/");
            return false;
        }
    }
    
    //Métodos para acessar propriedades individuais
    public String getMsgErro() { return this.msgErro; }
    public String getValor() { return this.valor; }
    public String getValorBin() { return this.valorBin; }
    public String getOcteto(int index) { return (index >= 0 && index <= 3) ? this.octetos[index] : "-1"; }
    public String getOctetoBin(int index) { return (index >= 0 && index <= 3) ? this.octetosBin[index] : "-1"; }
    public String[] getOctetos() { return this.octetos; }
    public String[] getOctetosBin() { return this.octetosBin; }
    
    //Método para acessar todas as propriedades
    public String[] getStatus(){
        String[] status = { this.msgErro,
                            this.valor,
                            this.valorBin,
                            Arrays.toString(getOctetos()),
                            Arrays.toString(getOctetosBin())
        };
        return status;
    }
}
