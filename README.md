# Лаборатори 9 — JaCoCo

**Оюутан:** М. Билгүүн-Эрдэнэ

**Оюутны код:** B222270046

## Хэрэгслийн хувилбар

~~~text
$ java -version
openjdk version "17.0.20.1" 2026-08-18
OpenJDK Runtime Environment (build 17.0.20.1+1-1-26.04-Ubuntu)
OpenJDK 64-Bit Server VM (build 17.0.20.1+1-1-26.04-Ubuntu, mixed mode, sharing)

$ mvn -version
Apache Maven 3.9.12
Maven home: /usr/share/maven
Java version: 17.0.20.1, vendor: Ubuntu, runtime: /usr/lib/jvm/java-17-openjdk-amd64
Default locale: en, platform encoding: UTF-8
OS name: "linux", version: "6.18.54.1-microsoft-standard-wsl2", arch: "amd64", family: "unix"
~~~

## A — Эхний хэмжилт

Таван happy-path тест амжилттай ажилласан. `results/jacoco-A.csv`-ийн дагуу Line хамралт 16/25 = **64%**, Branch хамралт 22/41 = **53.66%** байна.

Оролт шалгах нөхцөлүүдийн алдааны салаанууд болон тэтгэлгийн нөхцөлүүдийн зарим салаа дутуу хамрагдсан. Exception шидэх замууд, C/D/F дүн болон зөрчилтэй эсвэл шаардлага хангаагүй оюутанд 0 буцаах замууд бүрэн шалгагдаагүй.