Feature: Datatable Feature

  Scenario: Datatable Register Scenario

  Given Navigate to Register Website

  When  Fill the Areas

    | -Fields-        | -Values-          |
    | FirstName       | Huseyin           |
    | LastName        | U                 |
    | Email           | huzun35@gmail.com |
    | Mobile          | 1231323213213     |
    | CurrentAddress | Kasseler Str. 39  |

  Then Verify Register Page's Url





