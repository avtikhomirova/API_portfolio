package nasa.api.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private int id;
    private String title;
    private String description;
    private String link;
    private List<Layer> layers;
}
