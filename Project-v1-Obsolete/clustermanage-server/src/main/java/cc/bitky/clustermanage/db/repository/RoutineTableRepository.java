package cc.bitky.clustermanage.db.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cc.bitky.clustermanage.db.bean.routineinfo.LampStatusHistory;

public interface RoutineTableRepository extends MongoRepository<LampStatusHistory, String> {

}
