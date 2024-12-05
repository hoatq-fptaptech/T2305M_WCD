package hibernate_wcd.repository.Impl;

import hibernate_wcd.entity.Classroom;
import hibernate_wcd.repository.ClassroomRepository;
import hibernate_wcd.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class ClassroomRepositoryImpl implements ClassroomRepository {
    @Override
    public List<Classroom> all() {
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Classroom",Classroom.class).list();
        }
        //return null;
    }

    @Override
    public void save(Classroom classroom) {

    }

    @Override
    public Classroom findById(Long id) {
        return null;
    }

    @Override
    public void update(Classroom classroom) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Classroom findByName(String name) {
        return null;
    }
}
