package sistema.mre.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sistema.mre.models.DocumentoModel;
import sistema.mre.services.DocumentoService;

import java.util.List;

@RestController
@RequestMapping(value = "/documento")
public class DocumentoController {

    @Autowired
    private DocumentoService documentoService;

    @GetMapping
    public ResponseEntity<List<DocumentoModel>> getAllDocumentos() {
        return  ResponseEntity.ok().body(documentoService.findAll());
    }

    @PostMapping(value = "cadastrar-documento")
    public ResponseEntity<DocumentoModel> inserirDocumento(@RequestBody DocumentoModel documentoModel){
        return ResponseEntity.ok().body(documentoService.salvarDocumento(documentoModel));
    }

    @PutMapping("/{numeroVolume}")
    public ResponseEntity<DocumentoModel> atualizaDocumento(@PathVariable Integer numeroVolume, @RequestBody DocumentoModel documento) {

        if (documento.getNumeroVolume() == null || documento.getNumeroVolume() != numeroVolume) {
            return ResponseEntity.badRequest().build();
        }

        DocumentoModel documentoAtualizado = documentoService.atualizarDocumento(documento);

        if (documentoAtualizado == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(documentoAtualizado);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Object> deleteDocumentoById(@PathVariable(value = "/{id}") Integer id){
        documentoService.deleteDocumento(id);
        return ResponseEntity.ok().body("Documento Apagado com Sucesso!");
    }
}