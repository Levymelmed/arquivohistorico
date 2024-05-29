package sistema.mre.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sistema.mre.models.DocumentoModel;
import sistema.mre.repositories.DocumentoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentoService {

    @Autowired
    private DocumentoRepository documentoRepository;

    public List<DocumentoModel> findAll() {
        List<DocumentoModel> documento = documentoRepository.findAll();
        return documento;
    }
    public DocumentoModel salvarDocumento(DocumentoModel documentoModel) {
        return documentoRepository.save(documentoModel);
    }

    public Optional<DocumentoModel> findDocumentoById(Integer id) {
        return documentoRepository.findById(id);
    }

    public void deleteDocumento(Integer id) {
        documentoRepository.deleteById(id);
    }

    @Transactional
    public DocumentoModel atualizarDocumento(@org.jetbrains.annotations.NotNull DocumentoModel documentoModel) {
        Optional<DocumentoModel> documentoOptional = findDocumentoById(documentoModel.getNumeroVolume());
        if (documentoOptional.isPresent()) {
            DocumentoModel documentoExistente = documentoOptional.get();
            documentoExistente.setCorImpressao(documentoModel.getCorImpressao());
            documentoExistente.setSigla(documentoModel.getSigla());
            documentoExistente.setProcedencia(documentoModel.getProcedencia());
            documentoExistente.setEspecie(documentoModel.getEspecie());
            documentoExistente.setMesInicial(documentoModel.getMesInicial());
            documentoExistente.setMesFinal(documentoModel.getMesFinal());
            documentoExistente.setAno(documentoModel.getAno());
            documentoExistente.setBloco(documentoModel.getBloco());
            documentoExistente.setPratileira(documentoModel.getPratileira());

            return documentoRepository.save(documentoExistente);
        } else {
            throw new RuntimeException("Documento não encontrado com o número de volume: " + documentoModel.getNumeroVolume());
        }
    }
}