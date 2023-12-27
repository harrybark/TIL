package harryspring.config;

import org.springframework.boot.context.annotation.ImportCandidates;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.stream.StreamSupport;

public class MyAutoConfigImportSelector implements ImportSelector {

    private final ClassLoader classLoader;

    public MyAutoConfigImportSelector(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        Iterable<String> candidates = ImportCandidates.load(MyAutoConfigAnnotation.class, classLoader);
        return StreamSupport.stream(candidates.spliterator(), false).toArray(String[]::new);
        /*
        return new String[] {
                "harryspring.config.autoconfig.DispatcherServletConfig",
                "harryspring.config.autoconfig.TomcatWebServerConfig"
        };*/
    }

}
