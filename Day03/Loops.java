class Loops {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        i = 1; // Reset i for the next loop

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        i = 10; // Reset i for the next loop

        do {
        System.out.println("i is " + i);
        i++;
        } while (i < 5);

        for (i = 0; i <= 10; i++) {
        System.out.println(i);
        }
    }
    
}
