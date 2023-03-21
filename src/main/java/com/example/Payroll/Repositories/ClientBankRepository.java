    package com.example.Payroll.Repositories;

    import com.example.Payroll.model.ClientBank;
    import jakarta.persistence.EntityManager;
    import jakarta.persistence.EntityManagerFactory;
    import jakarta.persistence.PersistenceContext;
    import jakarta.persistence.TypedQuery;
    import jakarta.persistence.criteria.CriteriaBuilder;
    import jakarta.persistence.criteria.CriteriaQuery;
    import jakarta.persistence.criteria.Root;
    import org.springframework.beans.factory.annotation.Qualifier;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    import java.util.List;

//    @Repository
    public
    interface ClientBankRepository extends JpaRepository<ClientBank, Long> {
//        @PersistenceContext
//        EntityManager entityManager = null;
//
//        @Override
//        public List<ClientBank> getAll() {
//            CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//            CriteriaQuery<ClientBank> cq = cb.createQuery(ClientBank.class);
//            Root<ClientBank> root = cq.from(ClientBank.class);
//            cq.select(root);
//            TypedQuery<ClientBank> query = entityManager.createQuery(cq);
//            return query.getResultList();
//        }
//
//        @PersistenceContext(unitName = "default")
//        default void setEntityManagerFactory(@Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory) {
//            this.entityManager = entityManagerFactory.createEntityManager();
//        }

    }
