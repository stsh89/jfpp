/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalfinance.settings;

import java.util.Calendar;
import java.util.HashMap;

/**
 *
 * @author Vitaliy
 */
final public class Text {
    
    private static final HashMap<String, String> data = new HashMap();
    
    public static String get(String key) {
        if (data.containsKey(key)) return data.get(key);
        System.out.println("Такого ключа в Text не существует!"); // Для отладки
        return "";
    }
    
    public static String[] getMonths() {
        String[] months = new String[12];
        months[0] = get("JANUARY");
        months[1] = get("FEBRUAR");
        months[2] = get("MARCH");
        months[3] = get("APRIL");
        months[4] = get("MAY");
        months[5] = get("JUNE");
        months[6] = get("JULY");
        months[7] = get("AUGUST");
        months[8] = get("SEPTEMBER");
        months[9] = get("OCTOBER");
        months[10] = get("NOVEMBER");
        months[11] = get("DECEMBER");
        return months;
    }
    
    public static void init() {
        data.put("PROGRAM_NAME", "Домашняя бухгалтерия");
        data.put("PROGRAM_FILE", "Файл");
        data.put("PROGRAM_EDIT", "Правка");
        data.put("PROGRAM_VIEW", "Вид");
        data.put("PROGRAM_HELP", "Помощь");
        
        data.put("JANUARY", "Январь");
        data.put("FEBRUAR", "Февраль");
        data.put("MARCH", "Март");
        data.put("APRIL", "Апрель");
        data.put("MAY", "Май");
        data.put("JUNE", "Июнь");
        data.put("JULY", "Июль");
        data.put("AUGUST", "Август");
        data.put("SEPTEMBER", "Сентябрь");
        data.put("OCTOBER", "Октябрь");
        data.put("NOVEMBER", "Ноябрь");
        data.put("DECEMBER", "Декабрь");
        
        data.put("ERROR", "Ошибка");
        
        data.put("ERROR_TITLE_EMPTY", "Вы не ввели название!");
        data.put("ERROR_IS_EXISTS", "Такая запись уже существует!");
        data.put("ERROR_DATE_FORMAT", "Некорректный формат даты!");
        data.put("ERROR_CODE_EMPTY", "Вы не указали код!");
        data.put("ERROR_CURRENCY_EMPTY", "Вы не выбрали валюту!");
        data.put("ERROR_ARTICLE_EMPTY", "Вы не выбрали статью");
        data.put("ERROR_ACCOUNT_EMPTY", "Вы не выбрали счёт!");
        data.put("ERROR_RATE_INCORRECT", "Некорректное значение курса!");
        data.put("ERROR_AMOUNT_FORMAT", "Некорректный формат суммы!");
        data.put("ERROR_NO_BASE_CURRENCY", "Необходима базовая валюта! Установите сначала этот параметр в другой валюте, потом он сниметься в этой автоматически!");
        
        data.put("YES", "Да");
        data.put("NO", "Нет");
        
        data.put("MENU_FILE", "Файл");
        data.put("MENU_EDIT", "Правка");
        data.put("MENU_VIEW", "Вид");
        data.put("MENU_HELP", "Помощь");
        
        data.put("MENU_FILE_NEW", "Новый");
        data.put("MENU_FILE_OPEN", "Открыть");
        data.put("MENU_FILE_SAVE", "Сохранить");
        data.put("MENU_FILE_UPDATE_CURRENCIES", "Обновить курс валют");
        data.put("MENU_FILE_EXIT", "Выход");
        
        data.put("MENU_EDIT_ADD", "Добавить");
        data.put("MENU_EDIT_EDIT", "Изменить");
        data.put("MENU_EDIT_DELETE", "Удалить");
        
        data.put("MENU_VIEW_OVERVIEW", "Обзор");
        data.put("MENU_VIEW_ACCOUNTS", "Счета");
        data.put("MENU_VIEW_ARTICLES", "Статьи");
        data.put("MENU_VIEW_TRANSACTIONS", "Транзакции");
        data.put("MENU_VIEW_TRANSFERS", "Переводы");
        data.put("MENU_VIEW_CURRENCIES", "Валюты");
        data.put("MENU_VIEW_STATISTICS", "Статистика");
        
        data.put("MENU_HELP_ABOUT", "О программе");
        
        data.put("TOOLBAR_OVERVIEW", "Обзор");
        data.put("TOOLBAR_ACCOUNTS", "Счета");
        data.put("TOOLBAR_ARTICLES", "Статьи");
        data.put("TOOLBAR_TRANSACTIONS", "Транзакции");
        data.put("TOOLBAR_TRANSFERS", "Переводы");
        data.put("TOOLBAR_CURRENCIES", "Валюты");
        data.put("TOOLBAR_STATISTICS", "Статистика");
        
        data.put("ADD", "Добавить");
        data.put("EDIT", "Изменить");
        data.put("DELETE", "Удалить");
        data.put("CANCEL", "Отмена");
        
        data.put("TODAY", "Сегодня");
        
        data.put("LABEL_TITLE", "Название:");
        data.put("LABEL_CURRENCY", "Валюта:");
        data.put("LABEL_START_AMOUNT", "Начальный баланс:");
        
        data.put("FC_HOME", "Домашняя директория");
        data.put("FC_OPEN", "Открыть");
        data.put("FC_SAVE", "Сохранить");
        data.put("FC_CANCEL", "Отмена");
        data.put("FC_LOOK", "Папка:");
        data.put("FC_NAME_FILE", "Имя файла");
        data.put("FC_TYPE_FILE", "Тип файла");
        data.put("FC_UP", "Вверх");
        data.put("FC_NEW_DIRECTORY", "Новая папка");
        data.put("FC_LIST", "Список");
        data.put("FC_TABLE", "Таблица");
        data.put("FC_NAME", "Имя");
        data.put("FC_SIZE", "Размер");
        data.put("FC_TYPE", "Тип");
        data.put("FC_DATE", "Дата");
        data.put("FC_ATTR", "Атрибуты");
        data.put("FC_ALL_FILTER", "Все файлы");
        
        data.put("DIALOG_ABOUT_TITLE", "О программе");
        data.put("ABOUT", "<body style='font-size: 120%; text-align: center; width: 350px;'>"
                +"<h1>Домашняя бухгалтерия</h1><p><img src='file:images/main.png'/></p>"
                +"<p>Данная программа была сделана в Видеокурсе"
                +"<br/>\"Создание крупного проэкта на Java с нуля\""
                +"<br /><a style='font-weiht: bold;' href='https://src.myrusakov.ru/javaproject'>https://src.myrusakov.ru/javaproject</a></p>"
                +"<p>С уважением Виталий Шандыга!</p>"
                +"<p>Copyright " + Calendar.getInstance().get(Calendar.YEAR) + "</p></body>");
    }
}
