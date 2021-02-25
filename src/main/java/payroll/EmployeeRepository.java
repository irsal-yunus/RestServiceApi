package payroll;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
interface OrderRepository extends JpaRepository<Order, Long> {
    
}