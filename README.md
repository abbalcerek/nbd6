# zadania do wykladu 6 - scala

### build jar file (for all solution)
```bash
./mvnw clean package
```

### build jar for single solution with index `i`
```bash
./mvnw clean package -DmainClass=pl.balcerek.nbd.Zadanie<i>
```

### running jar
```bash
java -jar target/w6_scala-1.0-SNAPSHOT-jar-with-dependencies.jar
```

