package ru.sber.finalproject;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.sber.finalproject.repository.ChiefDoctorRepository;
import ru.sber.finalproject.repository.DoctorRepository;
import ru.sber.finalproject.repository.LaboratoryAssistantRepository;
import ru.sber.finalproject.repository.MedSpecializationRepository;
import ru.sber.finalproject.repository.MedTypesOfResearchRepository;
import ru.sber.finalproject.repository.PersonRepository;
import ru.sber.finalproject.repository.ReceptionRepository;
import ru.sber.finalproject.repository.ReceptionStatusRepository;
import ru.sber.finalproject.repository.VisitorRepository;
import ru.sber.finalproject.repository.VisitorResearchRepository;

//http://localhost:9090/swagger-ui/index.html#/
@OpenAPIDefinition(
        info = @Info(
                title = "Med_Reception CRUD API",
                version = "2.0",
                description = "Rafail's application",
                contact = @Contact(
                        name = "Rafail",
                        email = "rafail@mail.ru"
                ),
                license = @License(name = "Apache 2.0")
        )
)
@SpringBootApplication
@RequiredArgsConstructor
public class FinalProjectApplication {
    private final ChiefDoctorRepository chiefDoctorRepository;
    private final DoctorRepository doctorRepository;
    private final LaboratoryAssistantRepository laboratoryAssistantRepository;
    private final MedSpecializationRepository medSpecializationRepository;
    private final MedTypesOfResearchRepository medTypesOfResearchRepository;
    private final PersonRepository personRepository;
    private final ReceptionRepository receptionRepository;
    private final ReceptionStatusRepository receptionStatusRepository;
    private final VisitorRepository visitorRepository;
    private final VisitorResearchRepository visitorResearchRepository;

    public static void main(String[] args) {
        SpringApplication.run(FinalProjectApplication.class, args);
    }

}
