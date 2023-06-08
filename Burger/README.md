# Hamburgerező

## Leírás:

Az alkalmazás célja, hogy segítsen egy Hamburgerező cégnek kezelni a hamburgerek értékesítésének folyamatát. A menüben
három hamburger típus elérhető. Az alap hamburger, a prémium hamburger és a fitnesz hamburger.

Az alap hamburger osztály konstruktorának 4 paramétere van. A hamburger neve, a hús típusa, a zsemle típusa és a
hamgurger ára. Az ár paraméter legyen _double_ a többi pedig _String_.

**Extra feladat:** A zsemle és a hús típushoz _Enum_ használata _String_ helyett.

A hamburgerhez még tartozzon egy lista ami az extra feltéteket tartalmazza a burgerhez, maximum 4 darabot. Az extra
feltét egy _String_ névből és egy _double_ árból állnak. A feltét megvalósításához hozz létre egy feltét osztályt ami a
feltét nevét és az árát tartalmazza.

Az osztálynak legyen egy addExtraTopping() és egy removeExtraTopping() metódusa, amivel az extra feltéteket lehet
felvenni és eltávolítani a hamburgerről. Ezen kívül készíts egy toString() metódust, ami kiírja a hamgurger adatait és a
végső árát az extra feltétekkel.

A prémium hamburger konstruktora ne fogadjon paramétert, helyette hozzon létre egy prémium burger nevő hamburgert,
prémium hússal, prémium zsemlével és adj hozzá 6 feltétet. A prémium burger ára, 50%-al magasabb, mint a feltétek árának
összege. A prémium hamburgerhez nem lehet új feltétet felvenni vagy eltávolítani róla. A toString() metódus ugyan úgy
működik, mint az alap hamgurgernél.

A fitnesz hamburger az konstruktora 3 paramétert vár, a hamburger nevét, az árat és a hús típusát. A zsemle típusa
legyen beállítva teljes kiőrlésű zsemlére alapértelmezetten.

Az alap hamburgerhez hasonlóan a fitnesz hamburgert is lehessen extra feltétekkel ellátni, azonban ezeknek a feltéteknek
egészséges feltéteknek kell lenniük, maximum 3 darab ugyan. A toString() hasonló az előző két típushoz.

Az alkalmazás elkészítése során törekedjetek az öröklődés, polimorfizmus és a generikus típusok használatára.