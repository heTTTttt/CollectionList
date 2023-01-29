package phonebook;

import phonebook.Record;

public interface ContactDAO {
    // Добавление контакта - возвращает ID добавленного контакта
    public Long addContact(Contact contact) throws ContactDaoException;
    // Редактирование контакта
    public void updateContact(Contact contact) throws ContactDaoException;
    // Удаление контакта по его ID
    public void deleteContact(Long contactId) throws ContactDaoException;
    // Получение контакта
    public Contact getContact(Long contactId) throws ContactDaoException;
    // Получение списка контактов
    public List<Contact> findContacts() throws ContactDaoException;
}
