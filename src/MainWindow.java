import javax.swing.*;
// Создаём класс отвечающий за основное игровое окно
public class MainWindow extends JFrame { // JFrame - основной класс библиотеки Swing
    public MainWindow(){ // Создаём конструктор
        setTitle("Змейка");// Заголовок окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Условие прекращения работы программы
        setSize(320,345);// Установка размера окна
        setLocation(400,400);
        add(new GameField()); // Добавляем экземпляр класса в основное окно
        setVisible(true);
    }
    // Создаём экземпляр класса MainWindow
    // То место, откуда наша программа будет начинать свою работу
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
    }
}
