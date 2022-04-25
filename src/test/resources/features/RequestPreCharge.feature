Feature: Request pre charge

  Scenario Outline: Create request pre charge
    When User hit pre charge API with <ammount> and <description> and <itemType> and <paymentMethodDetailType> and <paymentMethodTypen>
    Then success verify response API with <status>

    Examples:
      | ammount | description | itemType | paymentMethodDetailType | paymentMethodTypen | status  |
      | 100     | TRIAL       | TRIAL    | BCA                     | Bank transfer      | Success |
      | 200     | TRIAL       | TRIAL    | MANDIRI                 | Bank transfer      | Exist   |
      | 200     | TRIAL       | TRIAL    | SHOPEEPAY               | EWallet            | Exist   |