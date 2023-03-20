package ru.sber.finalproject.cotroller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sber.finalproject.dto.ReceptionDto;
import ru.sber.finalproject.model.Reception;
import ru.sber.finalproject.service.ReceptionService;

@RestController
@RequestMapping("/reception")
@Tag(name = "Прием", description = "Контроллер для работы приемами пациентов")
public class ReceptionController extends GenericController<Reception, ReceptionDto> {
    private final ReceptionService receptionService;

    public ReceptionController(ReceptionService receptionService) {
        super(receptionService);
        this.receptionService = receptionService;
    }
}
