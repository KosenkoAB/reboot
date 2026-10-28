package org.example;


public class Main {

    public static boolean isLoginSuccessful(
            String username,
            String password,
            int statusCode) {

        // Реализовать проверку
        if(username != null && !password.isBlank() && statusCode == 200 && !username.isBlank()){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(
                isLoginSuccessful("tester", "pass123", 200)
        );

        System.out.println(
                isLoginSuccessful(null, "pass123", 200)
        );

        System.out.println(
                isLoginSuccessful("tester", "pass123", 401)
        );
    }


//    Задача 1. Проверка возраста
//    Написать метод isAdult(int age), возвращающий true, если возраст не меньше 18 лет.
//    Проверить значения: 17, 18, 25, 0, -1.
    public boolean isAdult(int age){
        if  (age >= 18){
            return true;
        }
        return false;
    }

    public void testAge(){
        System.out.println(isAdult(17));
        System.out.println(isAdult(18));
        System.out.println(isAdult(25));
        System.out.println(isAdult(0));
        System.out.println(isAdult(-1));
    }

//    Задача 2. Проверка пароля
//    Написать метод isValidPassword(String password). Пароль считается валидным, если он не null, содержит не менее 8 символов и не состоит только из пробелов.
//    Проверить: null, "", "   ", "abc123", "password123".

    public boolean isValidPassword(String password){
        int length = password.length();
        if (password == null){
            System.out.println("пароль не валидный - "+ password);
        } else if (length < 8) {
            System.out.println("пароль не валидный - "+ password);
        } else if (password.contains(" ")) {
            System.out.println("пароль не валидный - "+ password);
        }
        return false;
    }

    public void testPass(){
        System.out.println(isValidPassword(null));
        System.out.println(isValidPassword("   "));
        System.out.println(isValidPassword(""));
        System.out.println(isValidPassword("abc123"));
        System.out.println(isValidPassword("password123"));
    }

//    Задача 3. Анализ HTTP-статусов
//    Дан массив: int i = 1; i <= 5; i++
//    int[] codes = {200, 201, 400, 404, 500, 204};
//    Нужно написать методы, которые считают количество успешных ответов (200–299) и ошибок клиента (400–499).

    public int countPos(int [] codes){
        int a = 0;
        for (int i=0; i <= codes.length; i++){
            if(codes[i]>=200 && codes[i]<=299){
            a = a+i;}
        }
        return a;
    }

    public int countNeg(int [] codes){
        int a = 0;
        for (int i=0; i <= codes.length; i++){
            if(codes[i]>=400 && codes[i]<=499){
                a = a+i;}
        }
        return a;
    }


    int[] codes = {200, 201, 400, 404, 500, 204};

    public void testCount(){
        System.out.println(codes);
    }
}
