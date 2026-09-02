package vn.rikkei.exam.trainingroom.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.rikkei.exam.trainingroom.model.ResourceInventory;
public interface ResourceInventoryRepository extends JpaRepository<ResourceInventory, Long> { }
