package yncrea.lab06.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab06.core.dao.LanguageDAO;
import yncrea.lab06.core.entity.Language;

@Service
@Transactional
public class LanguageService {

    private LanguageDAO languageDAO;

    public LanguageService(LanguageDAO languageDAO) {
        this.languageDAO = languageDAO;
    }

    public void deleteAll(){languageDAO.deleteAll();}
    public void save(final Language language){languageDAO.save(language);}
    public long countAll(){return languageDAO.count();}
    public void deleteById(final long id){languageDAO.deleteById(id);}
}
