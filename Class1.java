public class Class1 {
  public static void main(String[] args) {
    int start = 20;
    int end = 100;
    int sum = 0;

    for (int i = start; i <= end; i++) {
      if (i % 3 == 0) {
        sum += i;
      }
    }

    System.out.println("Сума всіх кратних 3 чисел на проміжку від 20 до 100: " + sum);
  }
}

