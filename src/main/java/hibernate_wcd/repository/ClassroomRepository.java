package hibernate_wcd.repository;

import hibernate_wcd.entity.Classroom;

public interface ClassroomRepository extends Repository<Classroom,Long>{
    Classroom findByName(String name);
}
