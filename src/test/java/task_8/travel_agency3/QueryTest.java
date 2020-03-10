package task_8.travel_agency3;



import org.hibernate.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import task_8.travel_agency3.dao.ClientImpl;


import javax.persistence.EntityManager;

import static org.mockito.Mockito.when;


 class QueryTest {
    @Mock
    EntityManager entityManager;
    @Mock
    Session session;
    @InjectMocks
    ClientImpl clientImp;



    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void selectAllShouldGainTotal() {

    }

    @Test
    void findByIdShouldGainClient() {
       Client client1 = new Client();
       when(entityManager.unwrap(Session.class)).thenReturn(session);
       when(session.get(Client.class,1)).thenReturn(client1);
       clientImp.findById(1);
    }

    @AfterEach
    void tearDown() {

    }





}
