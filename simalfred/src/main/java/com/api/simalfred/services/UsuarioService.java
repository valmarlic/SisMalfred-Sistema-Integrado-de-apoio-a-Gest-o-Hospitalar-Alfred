package com.api.simalfred.services;

import com.api.simalfred.models.Usuario;
import com.api.simalfred.repositories.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    @Transactional
    public Usuario save(Usuario usuarioModel) {
     return usuarioRepository.save(usuarioModel);

    }

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return usuarioRepository.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return usuarioRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return usuarioRepository.existsByApartmentAndBlock(apartment,block);
    }
}
