package dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import domain.PrimaryTransaction;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
