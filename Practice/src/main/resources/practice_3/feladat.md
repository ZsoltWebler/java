# Feladatok

## E-mail címek - Algoritmizálás

A feladatod, hogy az alkalmazottaknak céges e-mail címet generálj. A céges e-mail cím a következő képpen néz ki. A
keresztnév első 3 karaktere nagy betűvel majd egy alulvonás és a vezetéknév első kettő karaktere végül a **@webler.hu**
suffix, vagyis _Erick Santiago_ e-mail címe ERI_sa@webler.hu.

Az e-mail címeknek egyedinek kell lenniük, így ha egy e-mail cím már létezik, akkor adj hozzá egy új számot. Például
_Erica Santiago_ e-mail címe, ERI_sa_2@webler.hu.

Olvasd be, nevek.txt fájlt, amiben kereszt és vezetéknév párokat találsz, majd minden alkalmazottnak generálj egy email
címet és ezt írd ki, az email.txt fájlba. Figyelj oda, hogy ne lehessen kettő egyforma e-mail cím.

## Fotókollekció - OOP

Írj egy `Photo` osztályt, melynek van egy neve és egy minősítése! Létre lehet hozni
csak névvel, vagy névvel és minősítéssel. A minősítés egy `Quality` enum, hogy a felhasználó
hány csillagot adott rá, lehet ez `Quality.NO_STAR`, `Quality.ONE_STAR` és `Quality.TWO_STAR`.
A `Photo` osztály implementálja a `Qualified` interfészt, melynek definiált a `Quality getQuality()`
és a `void setQuality(Quality)` metódusa.

Készíts egy `PhotoCollection` osztályt, mely a fotók egy listáját tartalmazza! 

Írj egy `addPhoto()` metódust, amivel fotókat lehet hozzáadni a kollekcióhoz.

Írj egy `listPhotos()` metódust, ami a konzolra írja az összes fotó nevét és annyi csillagot, amilyen a minősítése.

Írj egy `starPhoto()` metódust, mely kikeresi a megfelelő nevű fotót, és beállítja rajta a paraméterként
átadott minősítést! Ha nem talál a megadott névvel fotót, `PhotoNotFoundException` kivételt dob. Ez
egy saját kivétel, terjessze ki a `RuntimeException` osztályt!

Írj egy `numberOfStars()` metódust, mely visszaadja, hogy a képeken összesen mennyi csillag van!
Ha nincs minősítése, akkor 0 csillag. Ha a minősítése `Quality.ONE_STAR`, akkor egy csillaggal kell
számolni. Ha a minősítése `Quality.TWO_STAR`, akkor két csillaggal kell számolni.

## Fájlkezelés - lottószámok

A mappában találsz egy `otos.csv` fájlt (ez egyébként a https://bet.szerencsejatek.hu/jatekok/otoslotto/sorsolasok
címről tölthető le), és olvasd be. A fájl pontosvesszővel (`;`) elválasztva tárolja a mezőket, az alábbi formátumban.

| Év | Hét | Húzásdátum | 5 találat (db) | 5 találat (Ft) | 4 találat (db) | 4 találat (Ft) | 3 találat (db) | 3 találat (Ft) | 2 találat (db) | 2 találat (Ft) | Számok  |
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
| 2023 | 28 | 2023.07.15. | 0 | 0 Ft | 20 | 2 088 310 Ft | 2160 | 20 255 Ft | 61381 | 2 430 Ft | 27  56  75  76  81 |
| 2023 | 27 | 2023.07.08. | 1 | 1 724 177 660 Ft | 48 | 950 325 Ft | 2975 | 16 065 Ft | 76481 | 2 130 Ft | 4  17  55  67  89 |
| 2023 | 26 | 2023.07.01. | 0 | 0 Ft | 17 | 2 556 520 Ft | 2467 | 18 455 Ft | 63441 | 2 445 Ft | 18  42  44  48  86 |

Írj egy `LottoStatistic` osztályt és valósítsd meg az alábbi metódusokat:

- mostFrequentNumber() - Térjen vissza a legtöbbett kihúzott számmal
- leastFrequentNumber() - Térjen vissza a legkevesebbet kihúzott számmal
- highestPrize() - Írja ki a konzolra, hogy mekkora volt a legnagyobb kifizetés és mikor történt.
- myNumbers(Set<Integer> numbers) - A metódus kapjon 5 számot és nézze meg, nyert-e valamikor és ha igen, hányszor.
- getNumbers(int year, int week) - Térjen vissza, az adott heti nyertes számokkal.
- numberStatistics() - Térjen vissza egy Map-el amiben minden számhoz rendeld hozzá, hogy hányszor lett kihúzva.
- longestPeriodWithoutWinning() - Írja ki a konzolra, a leghosszabb időt, amíg nem volt ötös találat a kezdeti és a
  végdátumot is.