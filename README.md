Frikort

En applikasjon som bruker:
- Spring dependency injection (kun Spring Core). Bruk xml-konfigurasjon, ikke annotations, da vi bruker XML-konfig på Frikort
- JPA (med Hibernate som implementasjon)
- Database, gjerne MySql
- Maven for dependency management og bygging
- Et "web"-lag (representert av vanlige Spring-bønner som kalles på samme måte som vanlige tjenester)
- Et tjeneste-lag (tjenestene skal tilgjengeliggjøres som Spring-bønner, og injektes til bønnene i "web"-laget)
- DAO-er for å kommunisere med databasen (én pr tabell i databasen)

Hvordan fake web-laget:
- Ha en Main-klasse som gjør to hovedting:
	- Initialisere Spring-konteksten
	- Kjøre kall mot "web"-laget. Klassen må gjøre oppslag i Spring-konteksten for å hente bønnene i "web"-laget.

Enhetstesting:
- Utvikle gjerne med TDD, men dette er ikke kritisk
	- Det viktigste er at enhetstestene er gode, og gir god testdekning
- Bruk Mockito for mocking
- Du skal isolere klassene du tester, dvs alle avhengigheter skal mockes.
=======
