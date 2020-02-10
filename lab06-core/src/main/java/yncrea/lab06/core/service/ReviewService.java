package yncrea.lab06.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab06.core.dao.ReviewDAO;
import yncrea.lab06.core.entity.Review;

@Service
@Transactional
public class ReviewService {

    private ReviewDAO reviewDAO;

    public ReviewService(ReviewDAO reviewDAO) {
        this.reviewDAO = reviewDAO;
    }

    public void deleteAll(){reviewDAO.deleteAll();}
    public void save(final Review review){reviewDAO.save(review);}
    public long countAll(){return reviewDAO.count();}
    public void deleteById(final long id){reviewDAO.deleteById(id);}

}
