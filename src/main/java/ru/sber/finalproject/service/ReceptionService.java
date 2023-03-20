package ru.sber.finalproject.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.sber.finalproject.dto.ReceptionDto;
import ru.sber.finalproject.mapper.ReceptionMapper;
import ru.sber.finalproject.model.Reception;
import ru.sber.finalproject.repository.ReceptionRepository;

@Slf4j
@Service
public class ReceptionService extends GenericService<Reception, ReceptionDto> {
    private final ReceptionRepository receptionRepository;
    private final ReceptionMapper receptionMapper;

    public ReceptionService(ReceptionRepository receptionRepository, ReceptionMapper receptionMapper) {
        super(receptionRepository, receptionMapper);
        this.receptionRepository = receptionRepository;
        this.receptionMapper = receptionMapper;
    }
}
