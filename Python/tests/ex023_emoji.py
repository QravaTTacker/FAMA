import emoji
print(emoji.emojize("Salve man <purple_heart>", language='alias', delimiters=("<", ">")))
print(emoji.emojize("Python is fun :snake:"))
print(emoji.emojize("Python is fun {thumbs_up}", delimiters=("{", "}")))
print(emoji.emojize("Python is fun :red_heart:", variant="text_type"))
print(emoji.emojize("Python is fun :cat:", variant="emoji_type"))
