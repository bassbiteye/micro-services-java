package sn.isi.getway;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("sn.isi.getway");

        noClasses()
            .that()
            .resideInAnyPackage("sn.isi.getway.service..")
            .or()
            .resideInAnyPackage("sn.isi.getway.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..sn.isi.getway.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
