## Задание 2
Если необходимо, исправьте данный код
(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
> try {
> int d = 0;
> double catchedRes1 = intArray[8] / d;
> System.out.println("catchedRes1 = " + catchedRes1);
> } catch (ArithmeticException e) {
> System.out.println("Catching exception: " + e);
> }

* не инициализирован массив intArray
* ArrayIndexOutOfBoundsException 

> try {
> int [] intArray = new int[10];
> int d = 0;
> double catchedRes1 = intArray[8] / d;
> System.out.println("catchedRes1 = " + catchedRes1);
> } catch (ArithmeticException e | ArrayIndexOutOfBoundsException e) {
> System.out.println("Catching exception: " + e);
> }


## Задание 3
Дан следующий код, исправьте его там, где требуется
(задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
>public static void main(String[] args) throws Exception {
>try {
>int a = 90;
>int b = 3;
>System.out.println(a / b);
>printSum(23, 234);
>int[] abc = { 1, 2 };
>abc[3] = 9;
>} catch (Throwable ex) {
>System.out.println("Что-то пошло не так...");
>} catch (NullPointerException ex) {
>System.out.println("Указатель не может указывать на null!");
>} catch (IndexOutOfBoundsException ex) {
>System.out.println("Массив выходит за пределы своего размера!");
>}
>}
>public static void printSum(Integer a, Integer b) throws FileNotFoundException {
>System.out.println(a + b);
>}

* Throwable ex  выше по иерархии остальных исключений его убрать иначе не сможем увидеть другие
* FileNotFoundException метод printSum не работает c файлами такого исключения произойти не может тоже убрать