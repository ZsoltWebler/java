# Feladatok

# 1. Kapcsolódó szavak

Írj egy függvényt, ami összeköti a szavakat az azt megelőzővel a közös betűk mentén. Térj vissza az így kapott Stringgel
és a legkisessebb átfedő halmazzal.

```
join(["oven", "envier", "erase", "serious"]) ➞ ["ovenvieraserious", "2"]
join(["move", "over", "very"]) ➞ ["movery", "3"]
join(["to", "ops", "psy", "syllable"]) ➞ ["topsyllable", "1"]

// "to" and "ops" share "o" (1)
// "ops" and "psy" share "ps" (2)
// "psy" and "syllable" share "sy" (2)
// the minimum overlap is 1

join(["aaa", "bbb", "ccc", "ddd"]) ➞ ["aaabbbcccddd", "0"]
```

# 2. Majdnem palindróm

Adott egy szó és nézd meg, hány betűvel kell kiegészíteni, hogy palindrómot kapjunk belőle. Palindróm szavakra adjon
vissza 0-t.

```
minPalindromeSteps("race") ➞ 3
// Add 3 letters: "car" to make "racecar"

minPalindromeSteps("mada") ➞ 1
// Add 1 letter: "m" to make "madam"

minPalindromeSteps("mirror") ➞ 3
// Add 3 letters: "rim" to make "mirrorrim"
```

# 3. Következő szám

Írj egy függvényt, ami visszatér a következő számmal, ami az input szám számjegyeiből alkotható. Ha nincs nagyobb szám
térj vissza az inputtal.

Próbáld meg úgy megoldani, hogy nem generálod ki az összes lehetséges számot.

```
nextNumber(19) ➞ 91

nextNumber(3542) ➞ 4235

nextNumber(5432) ➞ 5432

nextNumber(58943) ➞ 59348
```

# 4. Kockadobás

Amikor két kockát dobunk egyszerre a 6-os eredmény 5x valószínűbb mint a 2-es, mert hatost 5 különböző kombinációból
kaphatunk (1 + 5, 5 + 1, 2 + 4, 4 + 2, 3 + 3), míg kettest, csak egyféleképpen (1 + 1).

Készíts egy függvényt, ami két argumentumot fogad. Az első paramétere, hogy hány kockával dobunk a második pedig, hogy
melyik számot szeretnénk kapni és térjen vissza a lehetséges kombinációk számával.

```
diceRoll(1, 3) ➞ 1

diceRoll(2, 5) ➞ 4
// 1 + 4, 4 + 1, 2 + 3, 3 + 2

diceRoll(3, 4) ➞ 3
// 1 + 1 + 2, 1 + 2 + 1, 2 + 1 + 1

diceRoll(4, 18) ➞ 80

diceRoll(6, 20) ➞ 4221
```

# 5. Legközelebbi magánhangzó

Készíts egy föggvényt, ami paraméterül egy Stringet kap és minden character pozíciójára kiszámolja, hogy milyen messze
van a legközelebbi magánhangzótól.

- Minden input tartalmaz legalább 1 magánhangzót
- A Stringek kisbetűsek

```
distanceToNearestVowel("aaaaa") ➞ [0, 0, 0, 0, 0]

distanceToNearestVowel("babbb") ➞ [1, 0, 1, 2, 3]

distanceToNearestVowel("abcdabcd") ➞ [0, 1, 2, 1, 0, 1, 2, 3]

distanceToNearestVowel("shopper") ➞ [2, 1, 0, 1, 1, 0, 1]
```

# 6. Sorrend

Készíts egy eljárást, ami paraméterül egy tömböt kap számokkal és kiírja a konzolra, hogy a kapott tömbben lévő számok
növekvő, csökkenő vagy vegyes sorrendben vannak. Ha két szám egyenlő, az nem rontja el a rendezést.

```
order([1 2 8 12 63]) -> Ascending

order([64 15 7 2 1]) -> Descending

order([64 15 99 2 1]) -> Mixed
```

# Bónusz Kaprekar állandó

- Vegyünk bármilyen 4-jegyű számot, amiben legalább kettő különbőző szám van.
- Rendezzük a számjegyeket csökkenő majd növekső sorrendbe, adjunk 0-t az elejére, ha szükséges.
- Vonjuk ki a kisebb számot a nagyobb számból.
- Menjünk vissza a 2. ponthoz és ismételjük.

A fenti eljárást, Kaprekar eljárásként ismert és mindig eléri a fix pontját (6174), maximum 7 iterációból.

```
Nézzük az algoritmust 3524-re:

5432 – 2345 = 3087
8730 – 0378 = 8352
8532 – 2358 = 6174
7641 – 1467 = 6174
```