// Dominic Cruz / 1/27/25 / EXE2
// roblox PLEASE killoran
public class Main {
    public static void main(String[] args) {
        int temp[] = {45, 29, 10, 22, 41, 28, 33};
        int ror[] = {95, 60, 25, 5, 0, 75, 90};
        String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        for (int i = 1; i <= 6; i++) {
            if (temp[i] > 32 && ror[i] < 50){
                System.out.println("it's likely snow on " + days[i]);
            } else if (ror[i] > 50) {
                System.out.println("its likely to rain on " + days[i]);
            }else {
                System.out.println("theres no rain or snow chance on " + days[i]);
            }
        }
    }
}
