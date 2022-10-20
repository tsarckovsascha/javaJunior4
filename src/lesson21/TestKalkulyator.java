package lesson21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Method;

public class TestKalkulyator {
    public static void main(String[] args) {
        try (BufferedReader reader =
                     new BufferedReader(new FileReader("src/data.txt"))) {
            String methodName = reader.readLine();
            String arg1 = reader.readLine();
            String arg2 = reader.readLine();
            Kalkulyator k = new Kalkulyator();

            System.out.println("________________");

            Class calClass = Class.forName("lesson21.Kalkulyator");

            Method[] declaredMethods = calClass.getDeclaredMethods();
            for(Method declaredMethod : declaredMethods ) {
                if (declaredMethod.getName().equals(methodName)){
                    declaredMethod.invoke(k, Integer.parseInt(arg1), Integer.parseInt(arg2));
                }

            }
            Method method = calClass.getMethod(methodName,int.class, int.class);

        } catch (Exception e){
            e.printStackTrace();
        }

        try (BufferedReader reader =
                     new BufferedReader(new FileReader("src/raz.txt"))) {
            String methodName = reader.readLine();
            String arg1 = reader.readLine();
            String arg2 = reader.readLine();
            Kalkulyator k = new Kalkulyator();

            System.out.println("________________");

        Class calClass1 = Class.forName("lesson21.Kalkulyator");

        Method[] declaredMethods = calClass1.getDeclaredMethods();
        for(Method declaredMethod : declaredMethods ) {
            if (declaredMethod.getName().equals(methodName)){
                declaredMethod.invoke(k, Integer.parseInt(arg1), Integer.parseInt(arg2));
            }

        }
        Method method = calClass1.getMethod(methodName,int.class, int.class);

    } catch (Exception e){
        e.printStackTrace();
    }

        try (BufferedReader reader =
                     new BufferedReader(new FileReader("src/umn.txt"))) {
            String methodName = reader.readLine();
            String arg1 = reader.readLine();
            String arg2 = reader.readLine();
            Kalkulyator k = new Kalkulyator();

            System.out.println("________________");

            Class calClass1 = Class.forName("lesson21.Kalkulyator");

            Method[] declaredMethods = calClass1.getDeclaredMethods();
            for(Method declaredMethod : declaredMethods ) {
                if (declaredMethod.getName().equals(methodName)){
                    declaredMethod.invoke(k, Integer.parseInt(arg1), Integer.parseInt(arg2));
                }

            }
            Method method = calClass1.getMethod(methodName,int.class, int.class);

        } catch (Exception e){
            e.printStackTrace();
        }

        try (BufferedReader reader =
                     new BufferedReader(new FileReader("src/del.txt"))) {
            String methodName = reader.readLine();
            String arg1 = reader.readLine();
            String arg2 = reader.readLine();
            Kalkulyator k = new Kalkulyator();

            System.out.println("________________");

            Class calClass1 = Class.forName("lesson21.Kalkulyator");

            Method[] declaredMethods = calClass1.getDeclaredMethods();
            for(Method declaredMethod : declaredMethods ) {
                if (declaredMethod.getName().equals(methodName)){
                    declaredMethod.invoke(k, Integer.parseInt(arg1), Integer.parseInt(arg2));
                }

            }
            Method method = calClass1.getMethod(methodName,int.class, int.class);

        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
