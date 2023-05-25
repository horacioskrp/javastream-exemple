
# Java Streams

Java 8 propose l'API Stream pour mettre en oeuvre une approche de la programmation fonctionnelle sachant que Java est et reste un langage orienté objet.

Le concept de Stream existe déjà depuis longtemps dans **l'API I/O**, notamment avec les interfaces InputStream et OutputStream. Il ne faut pas confondre l'API Stream de **Java 8** avec les classes de type xxxStream de **Java I/O**. Les streams de **Java I/O** permettent de lire ou écrire des données dans un flux (sockets, fichiers, ...). Le concept de Stream de **Java 8** est différent du concept de flux (stream) de  **l'API I/O** même si l'approche de base est similaire : manipuler un flux d'octets ou de caractères pour **l'API I/O** et manipuler un flux de données pour l'API Stream. Cette dernière repose sur le concept de flux (stream en anglais) qui est une séquence d'éléments.



L'API Stream facilite l'exécution de traitements sur des données de manière séquentielle ou parallèle. Les Streams permettent de laisser le développeur se concentrer sur les données et les traitements réalisés sur cet ensemble de données sans avoir à se préoccuper de détails techniques de bas niveau comme l'itération sur chacun des éléments ou la possibilité d'exécuter ces traitements de manière parallèle.

L'API Stream de **Java 8** propose une approche fonctionnelle dans les développements avec Java. Elle permet de décrire de manière concise et expressive un ensemble d'opérations dont le but est de réaliser des traitements sur les éléments d'une source de données. Cette façon de faire est complètement différente de l'approche itérative utilisée dans les traitements d'un ensemble de données avant **Java 8**.
