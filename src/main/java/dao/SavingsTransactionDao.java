package dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import domain.SavingsTransaction;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}