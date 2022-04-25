Feature: charge post

  Scenario Outline: Create payment charge
    When I hit charge API with value <request id> and <pre charge token> and <payment expiration duration>
    Then verify response API with <response>

    Examples:
      | request id | pre charge token | payment expiration duration | response |
      | RQS-1      | abcDEFghi        | 10                          | 200      |
      | RQS-2      |                  | 10                          | 422      |
      | RQS-3      | 12234567890      | 10                          | 422      |
      | RQS-4      | @#$%^&*()!       | 10                          | 422      |
      | RQS-5      | ancmvbfhjryuto   | 10                          | 422      |