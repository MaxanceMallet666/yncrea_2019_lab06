package yncrea.lab06.core.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab06.core.dao.BookDAO;
import yncrea.lab06.core.entity.Book;

@Service
@Transactional
public class BookService {

    private BookDAO bookDAO;

    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public void deleteAll(){bookDAO.deleteAll();}

    public void save(final Book book){bookDAO.save(book);}

    public long countAll(){return bookDAO.count();}

    public void deleteById(final long id){bookDAO.deleteById(id);}

    //Peut etre ajouter les fonctions findAllWithProjects() et getAllWithProjectCount()?
}
