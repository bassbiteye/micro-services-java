package sn.isi.m1;

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
            .importPackages("sn.isi.m1");

        noClasses()
            .that()
            .resideInAnyPackage("sn.isi.m1.service..")
            .or()
            .resideInAnyPackage("sn.isi.m1.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..sn.isi.m1.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
