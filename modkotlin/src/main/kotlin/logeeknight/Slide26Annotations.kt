package logeeknight

import com.fasterxml.jackson.annotation.JsonProperty

data class Address(
    @JsonProperty(value = "city") //Default annotation for constructor arguments
    val city: String,
    @field:JsonProperty(value = "street") //Annotate the field
    val street: String
)

