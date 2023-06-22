# Wargame

## Leírás:

A feladatotok egy háborús játék létrehozása lesz.

Készíts egy **Warrior** osztályt ami eltárolja a harcos _nevét_, _életerejét_ és _támadási értékét_.

Készíts egy **Army** osztályt ami **Warrior** objektumokat tárol valamilyen kollekcióban. Az **Army** osztálynak
ezen túl van egy _név_ mezője és megvalósít egy _getWarrior()_ metódust. A metódus kivesz a kollekcióból egy harcost és
vissza tér vele. Az **Army** osztály létrehozásakor valamilyen módon meg lehessen adni, hogy mi alapján adjon a metódus
vissza egy harcost.

Lehetséges módok:

- A legerősebb először (A legnagyobb támadási értékkel rendelkező harcost adja vissza)
- A legszívósabb először (A legnagyobb életelővel rendelkező harcost adja vissza)
- Véletlenszerű

Készíts egy **War** osztályt, aminek van egy _battle()_ metódusa, ami két **Army**-t vár paraméterül. Mindkét **Army**
-ból, elkér egy-egy harcost és a harcosok addig küzdenek egymással amíg valamelyik meg nem hal. A harc két harcos között
a következőképpen zajlik, minden körben véletlenszerűen kiválasztjuk valamelyik harcost a kettő közül aki megtámadja a
másikat. Ilyenkor a támadó támadási értékét levonjuk az áldozat életerejéből, ha maradt életereje vissza támad. A
következő körben megint véletlenszerűen választjuk, hogy melyik harcos támad először és ezt addig ismételjük, amíg
valamelyik harcos meg nem hal. A meghalt harcos helyére új harcos kerül a saját hadseregéből. A háború addig zajlik,
amíg valamelyik hadseregből el nem fogynak a harcosok.

Minden tevékenységet irass ki a konzolra, a következő formátumban:

`[Hadseregnév][Harcosnév] megtámadta [Hadseregnév][Harcosnév]-t és [X: 4 helyiértéken minden esetben] sebzést okozott neki`

Halál esetén:
`[Hadseregnév][Harcosnév] elhullott a csatában [Hadseregnév][Harcosnév] keze által`

A _main()_ metódusba hozz létre két hadsereget 10-10 harcossal és nézd meg különböző kiválasztási stratégiákkal ki nyer.