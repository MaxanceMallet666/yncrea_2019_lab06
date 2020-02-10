package yncrea.lab06.core.service;


import org.springframework.stereotype.Service;
import yncrea.lab06.core.dao.AuthorDAO;
import yncrea.lab06.core.entity.Author;

import javax.transaction.Transactional;

@Service
@Transactional
public class AuthorService {

    private AuthorDAO authorDAO;

    public AuthorService(AuthorDAO authorDAO) {
        this.authorDAO = authorDAO;
    }

    public void deleteAll(){authorDAO.deleteAll();}

    public void save(final Author author){authorDAO.save(author);}

    public long countAll(){return authorDAO.count();}

    public void deleteById(final long id){authorDAO.deleteById(id);}
}
