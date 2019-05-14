package throne.springreacto.petshopspring5.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import throne.springreacto.petshopspring5.model.Vet;
import throne.springreacto.petshopspring5.repositories.VetRepository;
import throne.springreacto.petshopspring5.services.VetService;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {
    private final VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long id) {
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public Vet save(Vet vet) {
        return vetRepository.save(vet);
    }

    @Override
    public void delete(Vet vet) {
        vetRepository.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }
}
