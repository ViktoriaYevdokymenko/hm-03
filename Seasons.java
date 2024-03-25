public class Seasons {
  public static void main(String[] args) {
    int month = 10;

    String season;

    switch (month) {
      case 1:
      case 2:
      case 12:
        season = "Зима";
        break;
      case 3:
      case 4:
      case 5:
        season = "Весна";
        break;
      case 6:
      case 7:
      case 8:
        season = "Літо";
        break;
      case 9:
      case 10:
      case 11:
        season = "Осінь";
        break;
      default:
        season = "невідома пора року";
        break;
    }

    System.out.println("Місяць номер: " + month + " це пора року: " + season + ".");
  }
}
