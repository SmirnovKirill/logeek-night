package logeeknight.slide9

import com.fasterxml.jackson.annotation.JsonProperty

data class Address(
    @JsonProperty(value = "city")
    val city: String,
    @field:JsonProperty(value = "street")
    val street: String
)