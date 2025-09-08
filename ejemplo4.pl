likes(john, pizza).
likes(mary, pizza).
likes(mary, sushi).
friends(X, Y) :- likes(X, Z), likes(Y, Z).