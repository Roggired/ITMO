## Примеры для лабораторных работ

### Соглашение об именовании Java (CamelCase)

В Java сообществе принято следовать следующим правилам при именовании чего-либо в коде:
1. Имена классов с большой буквы, слитно, каждое новое слово с большой буквы.
    - Неверно: 
      ```java 
       public class program {}
      ```
    - Верно:  
      ```java 
       public class Program {}
      ```
2. Имена методов, полей, переменных, пакетов с маленькой буквы, слитно, каждое новое слово с 
большой буквы.
    - Неверно: 
      ```java 
       private void print_array(int[] array) {}
      ```
    - Верно:
      ```java 
       private void printArray(int[] array) {}
      ```
3. Имена констант (`static` `final` поля) капсом через нижнее подчеркивание:
    - Неверно:
      ```java 
       private static final int arraySize = 0;
      ```
    - Верно:
      ```java 
      private static final int ARRAY_SIZE = 0;
      ```
4. Названия переменных, классов, полей должны начинаться с существительного и отражать смысл элемента
   - Неверно:
      ```java 
       public class S {
          private String str;
       }
      ```
   - Верно:
      ```java 
       public class Student {
          private String name;
       }
      ```
5. Названия методов должны начинаться с глагола и отражать смысл метода
   - Неверно:
      ```java
       public String aaa() {}
      ```
   - Верно:
      ```java 
       public String getName() {}
      ```
     
### Примеры
1. [Как собрать исполняемый jar-архив?](../samples/lab1/readme.md)