# Zenei adók

A rádióhallgatás ma már egyre inkább zene vagy hírek hallgatására korlátozódik. Ez a feladat három, folyamatosan zenét
sugárzó adóról szól, azok egyetlen napi műsorát feldolgozva.
A reklám elkerülése érdekében az adókat nevük helyett egyetlen számmal azonosítottuk.
A musor.txt állomány minden sora négy, egymástól egyetlen szóközzel elválasztott adatot
tartalmaz: a rádió sorszámát, amit a szám hossza követ két egész szám
(perc és másodperc) formában, majd a játszott szám azonosítója szerepel, ami a szám előadójából és címéből áll. A rádió
sorszáma az 1, 2, 3 számok egyike. Az adás minden adón 0 óra
0 perckor kezdődik. Egyik szám sem hosszabb 30 percnél, tehát a perc értéke legfeljebb 30, a
másodperc pedig legfeljebb 59 lehet. A szám azonosítója legfeljebb 50 karakter hosszú, benne
legfeljebb egy kettőspont szerepel, ami az előadó és a cím között található. A számok az elhangzás sorrendjében
szerepelnek az állományban, tehát a később kezdődő szám későbbi sorban található. Az állományban minden zeneszám
legfeljebb egyszer szerepel.

Példa:

```
1 5 3 Deep Purple:Bad Attitude
2 3 36 Eric Clapton:Terraplane Blues
3 2 46 Eric Clapton:Crazy Country Hop
3 3 25 Omega:Ablakok
```

Olvasd be a **musor.txt** file-t és oldd meg az alábbi feladatokat.

- Készíts egy **Zeneszam** osztályt és tárold el benne a szöveges file-ban tárolt sorokat.
- Készíts egy **Radio** osztályt és töltsd fel a Zeneszám objektumokkal.
- Készíts a Rádió osztályba egy metódust ami visszatér, hogy az adott rádió hány percni zenét játszott aznap.
- Készíts a Rádió osztályba egy metódust ami visszatér, hogy az adott rádió hány darab zenét játszott.
- Készíts a Rádió osztályba egy metódust ami visszatér, a leghosszabb zeneszámmal.
- Készíts a Rádió osztályba egy metódust ami visszatér, a legrövidebb zeneszámmal.
- Készíts a Rádió osztályba egy metódust ami visszatér, a legtöbbet játszott előadóval.
- Készíts a Rádió osztályba egy metódust ami paraméterben kap egy óra és perc értéket és visszatér az éppen játszott
  zeneszámmal.
- Készíts a Rádió osztályba egy metódust ami paraméterben kap egy előadót és visszatér az általa játszott számokkal.
- Készíts egy saját Rádiót, és töltsd fel a műsorát az egész napra, de figyelj oda, hogy a rádió nem játszhat olyan
  számot, amit bármelyik másik rádió játszott 2 órán belül. Írd ki az új rádió műsorát a **musor.txt** -hez hasonló
  formátumban.






