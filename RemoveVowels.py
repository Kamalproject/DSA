vowels=['a','e','i','o','u']
string="Kamallochan Panigrahi"
for i in range(len(string)):
  if(string[i].lower() in vowels):
    continue
  print(string[i],end=" ")
