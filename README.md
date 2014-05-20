Frikort

En applikasjon som bruker:
- Spring dependency injection (kun Spring Core). Bruk xml-konfigurasjon, ikke annotations, da vi bruker XML-konfig på Frikort
- Maven for dependency management og bygging
- Et tjeneste-lag (tjenestene skal tilgjengeliggjøres som Spring-bønner, og injektes til bønnene i "web"-laget)
- Mockede DAO-er

Enhetstesting:
- Utvikle gjerne med TDD, men dette er ikke kritisk
	- Det viktigste er at enhetstestene er gode, og gir god testdekning
- Bruk Mockito for mocking
- Du skal isolere klassene du tester, dvs alle avhengigheter skal mockes.

=======
