package yncrea.lab06.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab06.core.dao.TagDAO;
import yncrea.lab06.core.entity.Tag;

@Service
@Transactional
public class TagService {

    private TagDAO tagDAO;

    public TagService(TagDAO tagDAO) {
        this.tagDAO = tagDAO;
    }

    public void deleteAll(){tagDAO.deleteAll();}
    public void save(final Tag tag){tagDAO.save(tag);}
    public long countAll(){return tagDAO.count();}
    public void deleteById(final long id){tagDAO.deleteById(id);}

}
